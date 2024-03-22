@B32G17-227
Feature: Default

	
	@B32G17-224
	Scenario Outline: US182_AC01_TC01_Verify user can upload files and pictures as message attachments
		Given user is already logged in and landed on the home page
		    When user clicks to message tab
		    And  user clicks to upload files icon
		    And  user uploads a "<file>" into Upload files and images button
		    Then uploaded file should be "<displayed>" as message attachment
		    Examples:
		      | file                                       | displayed      |
		      | /Users/mkirmaci/Desktop/Ishimaru(2017).pdf | Ishimaru(2017) |
		      | /Users/mkirmaci/Desktop/Class Notes01.txt  | Class Notes01  |
		      | /Users/mkirmaci/Desktop/classNotes5.docx   | classNotes5    |
		      | /Users/mkirmaci/Desktop/Cybertruck.jpeg    | Cybertruck     |
		      | /Users/mkirmaci/Desktop/dog.png            | dog            |	

	
	@B32G17-225
	Scenario Outline: US182_AC02_TC01_Verify user can insert files and pictures in message input box
		Given user is already logged in and landed on the home page
		    When user clicks to message tab
		    And  user clicks to upload files icon
		    And  user uploads a "<pdfFile>" into Upload files and images button
		    And  user clicks to Insert in text button
		    And  user uploads a "<docxFile>" into Upload files and images button
		    And  user clicks to Insert in text button
		    And  user uploads a "<txtFile>" into Upload files and images button
		    And  user clicks to Insert in text button
		    And  user uploads a "<jpegFile>" into Upload files and images button
		    And  user clicks to Insert in text button
		    And  user uploads a "<pngFile>" into Upload files and images button
		    And  user clicks to Insert in text button
		    Then name of Insert in text button next to each file should change to: In text
		    Then five uploaded files should be displayed inside message input box
		    
		    Examples:
		
		      | pdfFile                                    | docxFile                                 | txtFile                                   | jpegFile                                | pngFile                         |
		      | /Users/mkirmaci/Desktop/Ishimaru(2017).pdf | /Users/mkirmaci/Desktop/classNotes5.docx | /Users/mkirmaci/Desktop/Class Notes01.txt | /Users/mkirmaci/Desktop/Cybertruck.jpeg | /Users/mkirmaci/Desktop/dog.png |	

	
	@B32G17-226
	Scenario: US182_AC03_TC01_Verify user removes files and pictures before sending the message
		Given user is already logged in and landed on the home page
		    When user clicks to message tab
		    And  user clicks to upload files icon
		    And  user uploads a "/Users/mkirmaci/Desktop/dog.png" into Upload files and images button
		    And  user clicks to Insert in text button
		    And  user clicks to x button
		    Then no uploaded file should be displayed as message attachment