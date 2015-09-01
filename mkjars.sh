#!/bin/bash

source ~qq/assorted/canonicalPath_function.sh

NAME="alarmtilt_soap_client"
SRCJAR="${NAME}-src.jar"
CLASSJAR="${NAME}.jar"
LOCATION=$(path-canonical $(dirname "$0"))
EPROOT="${LOCATION}/${NAME}/eclipse_project_root"
JARDEST="${LOCATION}/DISTRO/lib"

pushd "$EPROOT/src/"
if [[ $? != 0 ]]; then
   echo "Cannot cd -- exiting" >&2; exit 1
fi

find . ! -path '*/tests/*' | xargs jar cf "$JARDEST/$SRCJAR"

popd

pushd "$EPROOT/bin/"
if [[ $? != 0 ]]; then
   echo "Cannot cd -- exiting" >&2; exit 1
fi

find . ! -path '*/tests/*' | xargs jar cf "$JARDEST/$CLASSJAR"

popd

for F in "$SRCJAR" "$CLASSJAR"; do
   echo "------ Contents of $F --------"
   jar tf "$JARDEST/$F"
done

