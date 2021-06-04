Feature: English Score Features


@Test
Scenario: Onboarding Tests

Given The Onboarding slides
And Swipe till we reach to the 'Get started' page
Then Click on Get Started
Then Click on Continue with Email
Then Enter an email address in the Email field
And Enter a password in the password field
And Click on SignUp button
Then Verify the texts on Tell us your level page
And Click on Beginner
Then Verify the texts on why do you need to speak English
And Click on For my Job button
Then On the offers page select the offer with First session for $1
And Click on Get this offer
Then Verify the texts on Start the test page
And Click on Start the Test
Then Click on the ‘OK’ button on the test intro page
Then Click on the ‘Yes’ button on the “Your sound is low” intro page
Then Click on the ‘OK, allow the camera’ button on the “Our test is secure” page
Then Click on the ‘OK, let’s go’ button on the “Keep your face in the frame” page
Then Click on the ‘Start the test’ button on the “You’re ready to go!” page
Then Click on the ‘START’ button on Part 1 ‘Grammar and Vocabulary’ transition screen