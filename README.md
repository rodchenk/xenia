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
  	@Home -> @Login,
	@Login -> @Home -> @Contact
  ]
  info :[
	@Home -> mod: "today", freq: "daily",
	@News -> mod: "monday"
  ]
```
![map](https://user-images.githubusercontent.com/30366483/64978145-243a6e00-d8b5-11e9-8b54-b388fc7bd664.PNG)
