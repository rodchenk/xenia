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
  with: "React"
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
