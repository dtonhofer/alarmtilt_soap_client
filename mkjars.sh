#!/bin/bash

# --------------
# Utils
# --------------

# From: http://blog.publicobject.com/2006/06/canonical-path-of-file-in-bash.html
#
# Get the canonical path of a file or directory.
# When the file or directory itself is a link then this is also resolved.

function path-canonical-simple() {
   local dst="${1}"
   cd -P -- "$(dirname -- "${dst}")" &> /dev/null && echo "$(pwd -P)/$(basename -- "${dst}")"
}

function path-canonical() {
   local dst="$(path-canonical-simple "${1}")"
   while [[ -h "${dst}" ]]; do
      local linkDst="$(ls -l "${dst}" | sed -r -e 's/^.*[[:space:]]*->[[:space:]]*(.*)[[:space:]]*$/\1/g')"
      if [[ -z "$(echo "${linkDst}" | grep -E '^/')" ]]; then
         # relative link destination
         linkDst="$(dirname "${dst}")/${linkDst}"
      fi
      dst="$(path-canonical-simple "${linkDst}")"
   done
   echo "${dst}"
}

# -------------
# Do it 
#
# I really have to learn Gradle!
#
# Assumed organization:
#
# $ROOTDIR
# ├── alarmtilt_soap_client/
# │   ├── doc/
# │   ├── eclipse_project_root/ <----- EPROOT
# │   ├── LICENSE
# │   ├── mkjars.sh* <---------------- SCRIPT
# │   └── README.md
# └── DISTRO/
#     ├── lib/ <---------------------- JARDEST
#    ...
#
# -------------

NAME="alarmtilt_soap_client"
SRCJAR="${NAME}-src.jar"
CLASSJAR="${NAME}.jar"
THISDIR=$(dirname "$0")
ROOTDIR=$(path-canonical "$THISDIR/..")
EPROOT="${ROOTDIR}/${NAME}/eclipse_project_root"
JARDEST="${ROOTDIR}/DISTRO/lib"


# Make source jar

pushd "$EPROOT/src/" > /dev/null

if [[ $? != 0 ]]; then
   echo "Cannot cd -- exiting" >&2; exit 1
fi

find . ! -path '*/tests/*' | xargs jar cf "$JARDEST/$SRCJAR"

popd > /dev/null

# Make class jar

pushd "$EPROOT/bin/" > /dev/null

if [[ $? != 0 ]]; then
   echo "Cannot cd -- exiting" >&2; exit 1
fi

find . ! -path '*/tests/*' | xargs jar cf "$JARDEST/$CLASSJAR"

popd > /dev/null

# List contents for good measure

for F in "$SRCJAR" "$CLASSJAR"; do
   echo "------ Contents of $F --------"
   jar tf "$JARDEST/$F"
done


