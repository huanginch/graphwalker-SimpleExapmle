# A Simple Graph Walker Example with Selenium
This is a simple example of using the [GraphWalker](http://graphwalker.org) framework with Selenium.
You can go to my blog to read the [Graphwalker: A Simple Example with Selenium](https://inthuang.tw/2023/03/13/graphwalker-example/) article. (But it is written in Chinese.)
## Target
Test the [Wine World](https://inthuang.tw/WineWorld/) website path from Home page to Product page and ProductDetail page.

## Prerequisites
* Java 8 or higher (I use 19)
* Maven 3 or higher (I use 3.9.0)

## Running the example
1. Clone the repository
```bash
$ git clone https://github.com/huanginch/graphwalker-SimpleExapmle.git
```

2. Build the project
```bash
$ cd graphwalker-SimpleExapmle
$ mvn clean install
$ mvn graphwalker:generate-sources
```

3. Run the test
```bash
$ mvn graphwalker:test
```

## Model
The model is defined in the [WineWorld.json](https://github.com/huanginch/graphwalker-SimpleExapmle/blob/master/WineWorld/src/main/resources/WineWorld/WineWorld.json)

Use the [GraphWalker Studio](http://graphwalker.github.io/studio/) to view the model.