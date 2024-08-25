
Feature:Insert the data into the db using Api

  Scenario Outline: Insert json data through Api
    Given Hit the <url> 2
    Then Insert the <JsonData>

    Examples:
      | url | JsonData|
      |  " avfg " |  " aada"      |