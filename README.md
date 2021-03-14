# Sample React app
A web app using React Javascript library to demonstrate the concept of pipeline as code in [TeamCity](https://www.jetbrains.com/teamcity/)

## Pre-requisites
1. Install [Node JS](https://nodejs.org/en/download/)
2. An IDE like Atom or Webstorm

## TeamCity
As an example for configuration as code using TeamCity as the build system, see settings.kts in [.teamcity](.teamcity/) directory. 
The significance is that the configuration of a build system can be fully coded and version controlled.

## Install and Start

In the commandline,

1. Use `npm install` to install the dependencies
2. Use `npm start` to start react in development mode
3. The browser would open automatically. If not, open a browser and go to url: http://localhost:3000

## Structure
1. React components are placed in [src/components](./src/components) directory
2. [App.js](./src/App.js) file has all the components imported into it. Each component is a section from top of the page and is imported in the order of display in the browser
3. React hooks have been used in place of class based components

## Where to learn about React
1. Interactive tutorial from scrimba.com - https://scrimba.com/course/glearnreact
2. Read more about React framework at https://reactjs.org/ - Official website

