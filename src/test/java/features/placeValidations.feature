Feature: Validating Place API's
@Addplace
Scenario Outline:Verify if place is successfully added using Addplaceapi
Given Add place API with "<Address>" "<Language>" "<Name>" "<Website>" "<place_id>"
When User calls "Addplaceapi" with "Post" http request
Then the API call is success with status code 200
Then status in responsebody  is ok
And verify place_id created maps to "<Name>" using "Getplaceapi"

Examples:

| Address                       |Language| Name           |Website|
| 13 Robson street, forest lake |French-IN|Frontline house| http://google.com|


