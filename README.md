# Outside Source Weather App UPDATING>>>>>>>>

## Implementation Goals
* Separation of concerns
* Demonstrate extensible/scalable patterns
* Implement the UI

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
* AuthSDK (for logging in a mock user)

## UX/UI
* [UX/UI Interactive](https://xd.adobe.com/view/df7a3544-1610-41e7-90f3-f28ca721dbab-8a29/)
* [UX/UI Specs](https://xd.adobe.com/view/df7a3544-1610-41e7-90f3-f28ca721dbab-8a29/specs)

## Logging In

The `AuthSDK` can be found under the `authsdk` package. The following user can be used to test
the happy-path.
* Email: `test@test.com`
* Password: `password1234`

## API Instructions
### Location API:
Use the following API to retrieve longitude and latitude for a given zip or city

[MapQuest API](https://developer.mapquest.com/documentation/geocoding-api/address/get/)

**url**: `http://www.mapquestapi.com/geocoding/v1/`

**queries**:
- `key=HqdrQRdnVHXE48uM8wZ5LAbogRrR1BsT`
- `location=<LOCATION>`

### Weather API:
Use the following API to retrieve the forecast for longitude and latitude

[OpenWeather](https://openweathermap.org/api)

**endpoint**: `https://api.openweathermap.org/data/2.5/onecall`

**apiKey**: `123fe5d08a510d7e101cdd80946420cd`
