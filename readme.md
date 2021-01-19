# Post mortem

### Inledning

> Arbetets syfte och mål är att skapa en loggbok som ska spara text som är kopplad till en författare och ett datum. 
> Jag började med att skriva GUI, sedan MVC och sist lade jag till databas. 
> Utveckla? Inspiration idéer?

### Bakgrund

> Jag har använt mig av objektorienterad programmering och delar upp så att olika javaklasser använder sig av varandra. Min planering in för detta arbete var ett klassdiagram för att bestämma vad varje klass skulle göra och vilken klass som skulle styra över vad (presenterad i plan.png).
> Jag höll mig inte jättemycket till planeringen eftersom jag under arbetet kom på lättare sätt att göra uppgiften på utan att behöva väldigt många olika klasser. Programmet testades med en test-klass där den gav en SQLException om något gällande databasen inte skulle fungera. 

### Positiva erfarenheter

> Jag tycker att det gick väldigt bra med att skapa GUI samt MVC för loggboken, samt att de fungerar ganska effektivt utan problem. Det är väldigt tydligt vad allt gör och hur allt fungerar eftersom
> allt finns i en dropdown och är namngivet. Det gick bra eftersom det var ganska lätt att utöka loggboken när man väl hade en liten grund. 


### Negativa erfarenheter

> Under projektet fastnade jag på hur jag skulle göra för att få textrutorna att ta upp en bra mängd plats och hur man ändrade på deras storlek. Det löstes dock
> relativt snabbt eftersom problemet inte var speciellt svårt, det gällde bara att förstå var och hur man gjorde. Jag hade några svårigheter med att fixa till så att databasen faktiskt sparade saker och var
> den skulle spara saker. Det var svårt eftersom jag inte riktigt förstod mig på hur saker i databasen sparades. 
> Jag tror inte det är saker som riktigt går att undvika, kanske hade undvikt problemen med mer kunskap om databaser eller mer kunskap om hur Java Swing fungerar. Det har jag nu så problemen borde inte uppkomma igen. 

### Sammanfattning

> Jag har lärt mig mycket om hur Java Swing fungerar och hur man skapar flera textrutor, menyer, och dropdowns. Jag har lärt mig om hur man sparar, öppnar och redigerar bilder lokalt samt hur man gör det med hjälp av databaser. 
> Jag tror det hade varit mycket lättare att välja filer från databasen om det fanns något grafisk för att visa filnamn, författare och datum det redigerades. Istället finns det bara ett id för sakerna i databasen som man kan välja, utan att man vet vilken som är vilken.
> Det hade även gått att göra programmet lite mer användarvänligt med huvudfunktionerna lite mer "highlightade", det skulle göra programmet lättare att använda. Just nu är det väldigt simpelt men fungerande. 