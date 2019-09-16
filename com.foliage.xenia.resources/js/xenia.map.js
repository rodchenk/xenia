var config = {
	container: "#stats",
	hideRootNode: true
};

var root = {};

var parent_node = {
	parent: root,
    stackChildren: true,
	text: { name: "Home" }
};

var first_child = {
    stackChildren: true,
	parent: parent_node,
	text: { name: "News" }
};

var second_child = {
    stackChildren: true,
	parent: parent_node,
	text: { name: "Message" }
};

var third_child = {
    stackChildren: true,
	parent: second_child,
	text: {name: "Contact"}
};

var fourth_child = {
    stackChildren: true,
	parent: first_child,
	text: {name: "Login"}
};

var five_child = {
    stackChildren: true,
	parent: second_child,
	text: { name: "Logout"}
};

var parentless_child = {
	parent: root,
    stackChildren: true,
	text: {name: "Admin"}
}

var xenia_chart = [
	config, 
	parent_node,
	first_child, 
	second_child, 
	third_child, 
	fourth_child, 
	five_child, 
	parentless_child, 
	root
];