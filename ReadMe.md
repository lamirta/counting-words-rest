# Introduction
This repository contains a coding challenge: Counting Words


## REST-endpoints
These are the endpoints that are available in this application: 

### WordFrequencyClass


#### GET `/`
* Welcome message :)

#### POST `/highestFrequency`
* Endpoint returns the highest frequency in the text (several words might actually have this frequency)
* Format: text

#### POST `/frequencyForWord`
* Endpoint returns the frequency of the specified word
* Format: JSON. Example:
`{
    text: "<input text>",
    word: "<word you want frequency checked for>"
}`


#### POST `/mostFrequentNWords`
* Endpoint returns a list of the most frequent „n" words in the input text.
* Format: JSON. Example:
`{
    text: "<input text>",
    n: <number>
}`

