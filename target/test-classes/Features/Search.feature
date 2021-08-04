Feature: Search functionality


@Coffe2
Scenario: VERIFY USER CAN NOT LOGIN WITH INVALID CARD- NAGATIVE

Given LAUNCH FB URL 
Then ENTER INVlid USER AND PASSWORD
Then CLICK ON LOGIN
Then VERIFY USER SHOULD NOT LOGIN

@Coffe2
Scenario: Verify FB Logo & text under logo

Given LAUNCH FB URL 
Then Verify FB logo
Then text under logo









