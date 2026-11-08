# Book Club

Detta är en enkel webbapplikation som är utvecklad med **Spring Boot**, **Spring MVC**, **Maven** och **Thymeleaf**.

Applikationen innehåller följande funktioner:
- Visa en välkomstsida med dagens datum.
- Visa en lista med rekommenderade böcker.
- Filtrera böcker efter genre (även tom lista).

## Starta applikationen

1. Öppna terminalen i projektets rotmapp (där `pom.xml` finns).
2. Kör följande kommando:

```bash
mvn spring-boot:run
```

När applikationen har startat kan du öppna den i webbläsaren.

## Sidor

| Sida | URL | Beskrivning |
|---|---|---|
| Home | http://localhost:8080/home | Visar en välkomsttext och dagens datum. |
| Books | http://localhost:8080/books | Visar en lista med rekommenderade böcker. |
| Genre | http://localhost:8080/genre | Visar böcker och gör det möjligt att filtrera efter genre. |

### Exempel på filtrering

Du kan även filtrera böcker direkt via URL:en:

- Fantasy: `http://localhost:8080/genre?type=Fantasy`
- Deckare: `http://localhost:8080/genre?type=Deckare` tom lista!