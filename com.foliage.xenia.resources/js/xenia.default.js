$(document).ready(function(){
	$('.sidenav').sidenav();
	$('.modal').modal({
		onOpenEnd: function(){
			new Treant(xenia_chart);
		}
	});
	$('.dropdown-trigger').dropdown();
	$('.fixed-action-btn').floatingActionButton({
		direction: 'left'
	});
	$('.carousel.carousel-slider').carousel({
    	fullWidth: true,
    	indicators: true
  	});

})