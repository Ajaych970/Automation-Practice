Feature: Get the data from page no:2

  Scenario Outline: Fetch data of page

    Given Hit the <BaseUrl>
    Then Get the data <Url>
    And Match all the data of the Api response <ResponseJsonData>
    Examples:

    | BaseUrl             |  Url      | ResponseJsonData |
    | "https://reqres.in"   |  "/api/users?page=2" | "" |



