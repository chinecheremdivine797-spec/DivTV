#!/bin/sh
set -e
if command -v gradle >/dev/null 2>&1; then exec gradle "$@"; fi
printf '%s\n' 'Gradle is required to build DIV TV.' >&2
exit 1
