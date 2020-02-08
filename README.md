# Xenia language - just another domain specific language

```
Eine DSL-Sprache, mit der sich die Webseiten in 2 Minuten erstellen lassen
```
<img src="https://raw.githubusercontent.com/rodchenk/xenia/master/com.foliage.xenia.resources/img/logo.png" align="right" width="200"/> Die xenia-Sprache ist mit Xtext-Framework v. 2.18 erstellt. Die Sprache erzeugt nach der Ausfuhrung native `html` Seiten, CSS und JS Files, `htaccess` und Bilder. Im weiteren Verlauf wird die Unterstutzung von anderen Sprachen und/oder Frameworks (z.B. PHP, Angular) realisiert. 
Unter [Github Page](https://rodchenk.github.io/xenia) findet man ein Demo.
### Get started

1. Die Erstellung einer Anwendung in *xenia* beginnt mit Schlüsselwort `app` gefolgt von dem Namen der Webseite, die auch im Logo erscheint:

```ruby
app MyFirstApp
```

2. Danach muss man feststellen, welche Seiten die Webseite beinhalten soll. Dafur gibt man an:

```ruby
app MyFirstApp has pages[]
```

3. Die Namen der Seiten sind mit `@` At-Zeichen zu definieren:

```ruby
app MyFirstApp has pages[@Home, @News, @Contact, @Admin]
```

4. Semantik der Sprache bestimmt, dass die erste Seite, die in der Liste angegeben wird, als Root-Seite gekennzeichnet und entsprechend in `.htaccess` geschrieben wird.

5. Um die Verzweigungen zu definieren, muss man ein zusätzliches Block mit Schlusselwort `map` angeben:

```ruby
map: [
	Home -> (News, Contact),
	News -> (Contact),
	Contact -> (Home, News)
]
```

6. Es ist zu beachten, dass die Seitennamen nun ohne `@` angegeben werden und zu den im ersten Block angegebenen Seiten referenziert werden können. Die Eingabe einer nicht definierten Seite in `map`-Section wird eine Fehlermeldung auslösen.

![image](https://user-images.githubusercontent.com/30366483/65834656-8e073e80-e2dd-11e9-939d-fbd5a94b03d0.PNG)

7. Es stehen zwei Modi zur Verfügung: Entwickler- und Produktionsmodus:

```ruby
mode: development
# oder
mode: production
```
Im Entwicklermodus werden einige Werkzeuge angezeigt, wie z.B. `Sitemap Visualizer`.

![image](https://user-images.githubusercontent.com/30366483/65917246-3cdb7580-e3d7-11e9-85ab-2699a3ef49b3.png)

Ein Beispiel der frisch generierten Webseite ist unter [Github Page](https://rodchenk.github.io/xenia) zu finden.

***

```typescript
app Main has pages[
	@Home with modal(@Notification, @Login), 
	@Contact with modal(
		@Message, 
		@Logout with modal(
			@Contact
		)
	), 
	@Message
]
with: "native"
mode: DEV, // or PROD
xml: "/home/user/foliage/map.xml"
map :[
	Home -> (Login),
	Login -> (Home, Contact)
]
info :[
	Home -> mod: "today", freq: "daily",
	News -> mod: "monday"
]
```
Der AppName wird innerhalb von Logo angezeigt
```typescript
app foliage has pages [@Home, @News, @Contact]
map: Contact -> (Home, News)
```
![image](https://user-images.githubusercontent.com/30366483/65375895-5889a200-dc9a-11e9-89f1-4f194d310626.png)

Die xenia-Sprache wurde im Rahmen der Abschlussarbeit an der [Technischen Hochschule Brandenburg](https://th-brandenburg.de) entwickelt.
