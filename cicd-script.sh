#!/bin/bash

VERSION=$()
IMAGE_NAME=$(pwd | awk -F/ '{print$NF}')
TAG=quay.io/lumander/$IMAGE_NAME:$VERSION
podman build -t $TAG
podman tag $TAG
podman push <image_id> $TAG