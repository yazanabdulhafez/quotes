# quotes

This file contain

## Lab: 08 - OO Design and GSON

My partner in this lab:Tamara Bassam.

This lab contain the following classes:

### App Class

main function which will read and parse a json file data using Gson and JsonReader and set those data into Class Qoute and print a random qoute.

### Quotes Class

Its a class to reshape the quotes we read from the json file into wanted shape.

### Usage

To get random qoute just type $ gradle run and it will print random qoute from the array list for you.

How to run the App:
clone the repo from GitHub and open the project folder inside your IDE then open file name "build.gradle"copy and paste this line inside the dependencies in that folder "implementation 'com.google.code.gson:gson:2.8.8'" as in the following image.

![Gson](img/Gson.png)

To test the application you can run `./gradlew test`.

## Lab: 09 - Web requests

This is an update for previous lab : rather than using a hardcoded file of JSON data with quotes,it will grab quotes from an API and display those to the user

In this lab the function extended to grab quotes from an API and display those to the user.

## Usage of the application

To get random qoute just type $ gradle run and it will print random quote from the API for you if there is no connection it will show quotes from json file.

How to run the App:
clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the app by `./gradlew run`,and run the test by `./gradlew test`.
