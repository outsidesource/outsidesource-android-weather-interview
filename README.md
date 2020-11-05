# Outside Source Weather App

## Implementation Goals
* Separation of concerns
* Demonstrate extensible/scalable patterns
* Implement the UI accurately

## Requirements
* Implementation of navigation
* Implementation of APIs
* Implementation of Fragments and their corresponding layouts
* Implementation of all business logic

## What is Provided
* [Koin](https://insert-koin.io/) dependency injection setup
* MainActivity implementation
* LoginFragment shell with view model
* ForecastFragment shell with view model
* AuthenticationSDK (for logging in the user)
* Retrofit implementation

## API Instructions
### To obtain location coordinates:
Use the following API to retrieve longitude and latitude for a given zip or city

url: `http://www.mapquestapi.com/geocoding/v1/`

queries:
- `key=HqdrQRdnVHXE48uM8wZ5LAbogRrR1BsT`
- `location=<LOCATION>`

 [MapQuest API](https://developer.mapquest.com/documentation/geocoding-api/address/get/)

### To obtain Weather Information:
User the following API to retrieve the forecast for longitude and latitude

url: `https://dark-sky.p.rapidapi.com`

headers:
- `x-rapidapi-key` : `f668cd53e7mshf8741e3008da3b0p1b9112jsna657102f3c10`
- `X-RapidAPI-Host` : `dark-sky.p.rapidapi.com`

required query params:
- `latitude`
- `longitude`

optional query params:
- `lang` (default = en)
- `units` (default = auto)

[Dark Sky](https://rapidapi.com/darkskyapis/api/dark-sky/endpoints)
