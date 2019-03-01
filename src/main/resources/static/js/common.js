$(function() {
	$("#page-header").load("/header.html");
	
	$("#page-header").on("click", ".navbar a", function(e) {
		$(".navbar .nav-item").removeClass("active");
		$(this).parent().addClass("active");
		
		var url = $(this).attr("href");
		loadContent(e, url);
	});
});

function loadContent(event, url) {
	event.preventDefault();
	
	if (url == "/" || url == "#") {
		location.href = url;
	} else {
		$("#page-content").load(url);
	}
}