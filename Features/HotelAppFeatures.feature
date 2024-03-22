Feature: Hotel App Login
Scenario: Login Successful
Given I am on Hotel App Login Page
When I Enter Credential To Login
|username|password|
|vasuvespag|vasu1234|
|sriyaseth|Sriya@86|
|srijajasti|srijajasti|
|Varsharaj|Varsharaj|
|Chaithuuu|12309876|
Then I am logged in successfully