# Xenia language

```
Die DSL-Sprache, mit der sich die Webseiten in 2 Minuten erstellen lassen
```

### Get started

1. Die Erstellung des Programms in *xenia* beginnt mit Schlusselword `app` gefolgt von dem Namen der Webseite:

```ruby
app MyFirstApp
```

2. Danach muss man feststellen, welche Seiten die Webseite beinhalten soll. Dafur gibt man an:

```ruby
app MyFirstApp has pages[]
```

3. Die Namen der Seiten sind mit `@` At-Zeichen definiert werden:

```ruby
app MyFirstApp has pages[@Home, @News, @Contact, @Admin]
```

4. Semantik der Sprache bestimmt, dass die erste Seite, die in der Liste angegeben wird, wird als Root-Seite gekennzeichnet und entsprechend in `.htaccess` geschrieben.

5. Um die Verzweigungen zu definieren, muss man ein zusatzliches Block mit dem Wort `map` erstellen:

```ruby
map: [
	Home -> (News, Contact),
	News -> (Contact),
	Contact -> (Home, News)
]
```

6. Es ist zu beachten, dass die Seitenname nun ohne `@` angegeben werden und konnen zu den im ersten Block angegebenen Seiten referenziert werden. Die Eingabe einer nicht definierten Seite in `map`-Section wird eine Fehlermeldung auslosen.

![image](https://user-images.githubusercontent.com/30366483/65834656-8e073e80-e2dd-11e9-939d-fbd5a94b03d0.PNG)

7. Es stehen zwei Modi zur Verfugung: Entwickler- und Produktionsmodus:

```ruby
mode: development
# oder
mode: production
```

Ein Beispiel der generierten Webseite ist auf [Github Page](https://rodchenk.github.io/xenia) zu finden.

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
