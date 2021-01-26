Feature: Zero bank login

@regtest
Scenario: home page login
Given user is on Home page
When user login to application by entering username "username" and password "password" 
Then home page is displayed
And all the cards are displayed "true"

@regtest
Scenario: home page login
Given user is on Home page
When user login to application by entering username "usernam1" and password "passwor1"
Then home page is displayed
And all the cards are displayed "false"

@mobiletest
Scenario Outline: home page login
Given user is on Home page
When user login to application by entering username <username> and password <password>
Then home page is displayed
And all the cards are displayed "false"
Examples:
|username|  |password|
|user1   |  |pass1   |
|user2   |  |pass2   |
|user3   |  |pass3   |
|username|  |password|