## Baigiamasis darbas
### Titas Vaitkūnas

Testuojamas puslapis: https://www.tiketa.lt/

5 testai yra:
1. testCaptionFieldWithAValidInput
   1. Caption input
   2. Click on Search
   3. Find from results containing actualInput
2. confirmXButtonFunctionalityOnCityField
   1. Click on city field's span
   2. Click on "Vilnius"
   3. Click X 
   4. Confirm if Dropdown option displays "All cities"
3. testDateFunctionalityWithInvalidInputs
   1. Set date from
   2. Set date to
   3. Click Search
   4. "No events have been found" should be displayed
4. testLoginFunctionality
   1. Click on "Login"
   2. Input username
   3. Input password
   4. Click on "Login" button
   5. Check if you're logged in
5. testCityFieldFunctionality
   1. Click on City field and select Vilnius
   2. Click on City field and select Alytus
   3. Confirm that there are both cities in filters