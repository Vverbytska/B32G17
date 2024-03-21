@B32G17-233
Feature: File upload from Appreciation page
  User story: As a user, I should be able to upload files and pictures while sending appreciation

  @B32G17-228
  Scenario Outline: Verify user can upload files and images to Appreciation
    Given user is on Appreciation page
    And user clicks on Upload files button
    And user clicks on Upload files and images button
    Then user chooses "<file>" to upload
    Then user should see file "<name>" under Attached files
      Examples:
      | file                                                                      | name                         |
      | C:\Users\volodka\Desktop\cydeo\jira.png                                   | jira                         |
      | C:\Users\volodka\Desktop\cydeo\textFile.txt                               | textFile                     |
      | C:\Users\volodka\Desktop\cydeo\S2\G17_Sprint_2.pdf                        | G17_Sprint_2                 |
      | C:\Users\volodka\Desktop\cydeo\Automation\HTML\HTML Class\cybertruck.jpeg | cybertruck                   |
      | C:\Users\volodka\Desktop\cydeo\JAVA\Java_Interview_Questions_ALL.docx     | Java_Interview_Questions_ALL |

  @B32G17-229
  Scenario: Verify user can upload all 5 types of files together
    Given user is on Appreciation page
    And user clicks on Upload files button
    And user clicks on Upload files and images button
    Then user chooses all files to upload
      | C:\Users\volodka\Desktop\cydeo\jira.png                                   |
      | C:\Users\volodka\Desktop\cydeo\textFile.txt                               |
      | C:\Users\volodka\Desktop\cydeo\S2\G17_Sprint_2.pdf                        |
      | C:\Users\volodka\Desktop\cydeo\Automation\HTML\HTML Class\cybertruck.jpeg |
      | C:\Users\volodka\Desktop\cydeo\JAVA\Java_Interview_Questions_ALL.docx     |
    Then user should see files names under Attached files
      | jira | textFile | G17_Sprint_2 | cybertruck | Java_Interview_Questions_ALL |

  @B32G17-230
  Scenario Outline: Verify user can upload files by drag and drop
    Given user is on Appreciation page
    And user clicks on Upload files button
    And user drags and drops "<file>" to the Upload files field
    Then user should see file "<name>" under Attached files
    Examples:
      | file                                                                      | name                         |
      | C:\Users\volodka\Desktop\cydeo\jira.png                                   | jira                         |
      | C:\Users\volodka\Desktop\cydeo\textFile.txt                               | textFile                     |
      | C:\Users\volodka\Desktop\cydeo\S2\G17_Sprint_2.pdf                        | G17_Sprint_2                 |
      | C:\Users\volodka\Desktop\cydeo\Automation\HTML\HTML Class\cybertruck.jpeg | cybertruck                   |
      | C:\Users\volodka\Desktop\cydeo\JAVA\Java_Interview_Questions_ALL.docx     | Java_Interview_Questions_ALL |

  @B32G17-231
  Scenario: Verify user can insert the files and images into the text
    Given user is on Appreciation page
    And user clicks on Upload files button
    And user clicks on Upload files and images button
    Then user chooses all files to upload
      | file | C:\Users\volodka\Desktop\cydeo\jira.png | C:\Users\volodka\Desktop\cydeo\textFile.txt | C:\Users\volodka\Desktop\cydeo\S2\G17_Sprint_2.pdf | C:\Users\volodka\Desktop\cydeo\Automation\HTML\HTML Class\cybertruck.jpeg | C:\Users\volodka\Desktop\cydeo\JAVA\Java_Interview_Questions_ALL.docx |
    And user clicks on Insert in text buttons
    Then user should see text inside the button changed to In text
    Then user should see files inside the text box


  @B32G17-232
  Scenario: Verify user can remove files before sending
    Given user is on Appreciation page
    And user clicks on Upload files button
    And user clicks on Upload files and images button
    Then user chooses all files to upload
      | file | C:\Users\volodka\Desktop\cydeo\jira.png | C:\Users\volodka\Desktop\cydeo\textFile.txt | C:\Users\volodka\Desktop\cydeo\S2\G17_Sprint_2.pdf | C:\Users\volodka\Desktop\cydeo\Automation\HTML\HTML Class\cybertruck.jpeg | C:\Users\volodka\Desktop\cydeo\JAVA\Java_Interview_Questions_ALL.docx |
    And user clicks on all remove buttons
    Then user verifies all files are removed