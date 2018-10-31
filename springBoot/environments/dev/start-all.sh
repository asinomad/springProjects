#!/usr/bin/env bash

USERID=$(id -u) GROUPID=$(id -g) docker-compose -f docker-compose.yml --project-name=main-application down -v


USERID=$(id -u) GROUPID=$(id -g) docker-compose -f docker-compose.yml --project-name=main-application up --build -d


