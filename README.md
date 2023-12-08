# SBE Java Sample Application

This sample application is designed to decode `api/v3/exchangeInfo` endpoint's response to YAML, when using the [Binance Spot API Simple Binary Encoding (SBE)](https://github.com/binance/binance-spot-api-docs/blob/master/faqs/sbe_faq.md).

Moreover, there are additional decoder classes that can be useful for decoding SBE responses from other endpoints in the Binance Spot API.

## Getting Started

1. Clone the source code to your local end.
```shell
$ git clone git@github.com:binance/binance-sbe-java-sample-app
```

2. Navigate to the directory where `pom.xml` file is located and build the project with `Maven` to generate `./target/sbe-sample-app-<version>-SNAPSHOT.jar`.

```shell
$ mvn clean install
```

## Usage

The following commands use `./target/sbe-sample-app-1.0-SNAPSHOT.jar` to output on STDOUT the `api/v3/exchangeInfo` SBE response in YAML.

### Via reading SBE-encoded response from STDIN

```shell
$ curl -X GET -H 'Accept: application/sbe' -H 'X-MBX-SBE: 1:0' 'https://api.binance.com/api/v3/exchangeInfo' | java -jar ./target/sbe-sample-app-1.0-SNAPSHOT.jar -
```

### Via downloading SBE-encoded response within the app

```shell
$ java -jar ./target/sbe-sample-app-1.0-SNAPSHOT.jar 'https://api.binance.com/api/v3/exchangeInfo'
```

The `spot_sbe` directory contains the decoder classes, which you can consult to explore other endpoints.

### Testnet 
To use the Spot Testnet API, you only need to replace the URL portion in the commands with `https://testnet.binance.vision/api/v3/exchangeInfo`.

## Update

### Java decoders

The `src/main/java/spot_sbe` directory contains code generated by [simple-binary-encoding](https://github.com/real-logic/simple-binary-encoding), which you will likely want to reuse verbatim. However, if you would like to update it, please navigate to the root of this project and follow these steps:

1) Download the [spot_latest.xml](https://github.com/binance/binance-spot-api-docs/tree/master/sbe/spot_latest.xml) schema file to `src/main/resources`:
```shell
$ mkdir -p src/main/resources
$ cd src/main/resources
$ wget https://github.com/binance/binance-spot-api-docs/tree/master/sbe/spot_latest.xml
$ cd -
```

2) Clone & build [simple-binary-encoding](https://github.com/real-logic/simple-binary-encoding):
```shell
$ git clone https://github.com/real-logic/simple-binary-encoding.git --branch '1.30.0'
$ cd simple-binary-encoding
$ ./gradlew
$ cd ..
```

3) Run the SBE tool code generator built in the previous step:
```shell
$ java \
    -Dsbe.output.dir=src/main/java/ \
    -Dsbe.target.language=Java \
    -jar simple-binary-encoding/sbe-all/build/libs/sbe-all-1.30.0.jar \
    src/main/resources/spot_latest.xml
```

4) Remove unneeded encoder files:
```shell
$ find src/main/java/spot_sbe -type f -name '*Encoder.java' -exec rm '{}' \;
```