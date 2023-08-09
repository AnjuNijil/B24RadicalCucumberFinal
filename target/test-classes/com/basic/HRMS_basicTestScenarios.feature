Feature: This file contains test scenarios of add employee

Scenario: 1. validate New employee getting created and searched in HRMS System
Given Login with admin user
When Go to PIM TAB
Then validate user getting searched

Scenario: 2.Validate employee not get created if mandatory feild is missing
Then Login with admin user
When Go to PIM TAB
Given validate user  not getting searched
