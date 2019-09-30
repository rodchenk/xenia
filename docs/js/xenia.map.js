var config = {
	container: "#stats",
	hideRootNode: true
};

var root = {};

var Home = {
	parent: root, 
	stackChildren: true,
	text: { name: "Home"}
}
var News = {
	parent: Home, 
	stackChildren: true,
	text: { name: "News"}
}
var Contact = {
	parent: Home, 
	stackChildren: true,
	text: { name: "Contact"}
}
var Admin = {
	parent: Home, 
	stackChildren: true,
	text: { name: "Admin"}
}

var xenia_chart = [
	config, 
	root,
	Home,
	News,
	Contact,
	Admin
];
