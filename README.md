Tässä sovelluksessa haetaan säätietoa OpenWeatherMap API:sta


Retrofit:
Retrofit hoitaa HTTP-pyynnöt.
Eli käytännössä kun käyttäjä hakee kaupungin, Retrofit tekee verkkokutsun API:lle.

API palauttaa datan JSON-muodossa.

API-kutsu tehdään coroutineilla viewModelScope.launch {} sisällä.
Se tarkoittaa, että verkkokutsu tehdään taustasäikeessä eikä UI jää jumiin.
Kun data tulee, UI päivittyy automaattisesti.

UI-tila:
ViewModelissa on WeatherUiState data class, joka sisältää:
-kaupungin nimen
-säädatan
-lataustilan
-virheen
ViewModel hallitsee tätä tilaa.
Compose kuuntelee tilaa collectAsState() avulla.
Kun tila muuttuu, Compose piirtää UI:n uudelleen.
