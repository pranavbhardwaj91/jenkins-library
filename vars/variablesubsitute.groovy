#!/usr/bin/env groovy

def student_name = "pranav";

def call(Closure body){
  node {
    println student_name
  }
}
