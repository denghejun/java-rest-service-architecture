#!/bin/bash -e
for file in $(git diff --name-only \*.java)
do
  fileName=$(basename "$file")
  git show ":$file" | mvn checkstyle:check -Dcheckstyle.includes=**\\/"$fileName" # we only want to lint the staged changes, not any un-staged changes
  if [ $? -ne 0 ]; then
    exit 1
  fi
done