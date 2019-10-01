# failing-sbt-13
Reproduction of failing sbt build

## Fail

To reproduce type twice
```
docker run -w /code -v $(pwd):/code \
-v $(pwd)/localsbtspace:/.sbt hseeberger/scala-sbt:8u222_1.3.2_2.12.10 \
sbt -Dsbt.global.base=.sbt/global -Dsbt.boot.directory=.sbt/boot/ clean
```
