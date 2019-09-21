# Xenia language

```
DSL language to generate static Web sites
```

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
  with: "React",
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
app foliage has pages [@Home, @News]
```
![image](https://user-images.githubusercontent.com/30366483/65375895-5889a200-dc9a-11e9-89f1-4f194d310626.png)
