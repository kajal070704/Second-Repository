Feature: Hotel App Login
Scenario: Login Successful
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter the password as "vasu1234"
And I click login
Then I am loged in successfully


Scenario: Search Successful
Given I am on Seatch Hotel Page.
When I choose location as "Ney Work"
And I choose Hotels as "Hotel Sunshine"
And I choose Room Type as "Double"
And I choose Number of Rooms as "1 - room"
And I click search
Then I am Searched  successfully




