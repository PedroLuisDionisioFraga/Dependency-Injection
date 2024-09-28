# Proposal
Create a code implementing dependency injection\
The theme is free, the code can be related to the project\
It can be implemented in the programming language of your choice\
Submit the link to the repository with the code (add the link as an attachment in the task response).

## Overview
This project is a simple product management application. It allows users to add, search, and manage products through a command-line interface.

## Architecture
- model
  - ProductModel.java: Defines the ProductModel class which represents a product with attributes like ID, name, and price.
- repository
  - ProductRepository.java: Interface for product repository operations.
  - ProductRepositoryImpl.java: Implementation of the ProductRepository interface. Handles the actual data storage and retrieval.
- service
  - ProductService.java: Interface for product service operations.
  - ProductServiceImpl.java: Implementation of the ProductService interface. Contains business logic for managing products.

## Pre-requisites
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

## Usage
1. Clone the repository
```bash
git clone git@github.com:PedroLuisDionisioFraga/Dependency-Injection.git
cd dependency-injection
```
2. Compile the Java files
```bash
javac -d bin *.java
```
3. Run the application
```bash
java -cp bin Main
```
