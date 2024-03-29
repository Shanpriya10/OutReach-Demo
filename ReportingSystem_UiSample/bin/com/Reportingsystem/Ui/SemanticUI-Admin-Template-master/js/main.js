HMZAdminMgr = {};
HMZAdminMgr.load = function(){
	$('.ui.sidebar').sidebar();
}
HMZAdminMgr.ramUsageChart = function(details){
	    
	    var ctx = document.getElementById('ramUsageChart');
		var data = {
			labels: details.labels,
			datasets: [
				{
					data: details.data,
					backgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8"
					],
					hoverBackgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8"
					]
				}]
		};
		var defectDoughnutChart = new Chart(ctx, {
			type: 'doughnut',
			animation:{
				animateScale:true
			},
			data: data,
			options: {
				legend :{
					display : false
				}
			}
		});
		$('#ramUsageChart').closest('table').find(".chartData").html(HMZAdminMgr.generateTabularData(data));
}
HMZAdminMgr.renderNewAccountsChart = function(details){
	    var ctx = document.getElementById('newAccountsChart');
		var data = {
			labels: details.labels,
			datasets: [
				{
					data: details.data,
					backgroundColor: [
						"#FF6384",
						"#36A2EB"
					],
					hoverBackgroundColor: [
						"#FF6384",
						"#36A2EB"
					],
					label: 'Accounts'
				}]
		};
		var barChart = new Chart(ctx, {
			type: 'horizontalBar',
			animation:{
				animateScale:true
			},
			data: data,
			options: {
				legend :{					
					display : false
				}
			}
		});
}
HMZAdminMgr.renderProcessWiseChart = function(details){
	    var ctx = document.getElementById('processWiseChart');
	    var data = {
				labels: details.labels,
				datasets: [
					{
						data: details.data,
						backgroundColor: [
							"#FF6384",
							"#36A2EB",
							"#FFCE56",
							"#21ba45",
							"#a333c8",
							"#4BC0C0"
						],
						hoverBackgroundColor: [
							"#FF6384",
							"#36A2EB",
							"#FFCE56",
							"#21ba45",
							"#a333c8",
							"#4BC0C0"
						]
					}]
			};
			var barAreaChart = new Chart(ctx, {
				type: 'doughnut',
				animation:{
					animateScale:true
				},
				data: data,
				options: {
					legend :{					
						display : true
					}
				}
			});

	$('#processWiseChart').closest('table').find(".chartData").html(HMZAdminMgr.generateTabularData(data));
	}
HMZAdminMgr.renderDiscUsageChart = function(details){
	    var ctx = document.getElementById('discUsageChart');
		var data = {
			labels: details.labels,
			datasets: [
				{
					data: details.data,
					backgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8",
						"#4BC0C0"
					],
					hoverBackgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8",
						"#4BC0C0"
					]
				}]
		};
		var pieChart = new Chart(ctx, {
			type: 'pie',
			animation:{
				animateScale:true
			},
			data: data,
			options: {
				legend :{					
					display : false
				}
			}
		});
		$('#discUsageChart').closest('table').find(".chartData").html(HMZAdminMgr.generateTabularData(data));
}
HMZAdminMgr.renderBandwidthUsageChart = function(details){
	    var ctx = document.getElementById('bandwidthUsageChart');
		var data = {
			labels: details.labels,
			datasets: [
				{
					data: details.data,
					backgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8",
						"#4BC0C0"
					],
					hoverBackgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#FFCE56",
						"#21ba45",
						"#a333c8",
						"#4BC0C0"
					]
				}]
		};
		var barAreaChart = new Chart(ctx, {
			type: 'doughnut',
			animation:{
				animateScale:true
			},
			data: data,
			options: {
				legend :{					
					display : false
				}
			}
		});

$('#bandwidthUsageChart').closest('table').find(".chartData").html(HMZAdminMgr.generateTabularData(data));
}
HMZAdminMgr.generateTabularData = function(data){
    var labels = data.labels, 
	color = data.datasets[0].backgroundColor,
	dataset = data.datasets[0].data;
	var tableHtml = "<table class=\"ui very basic table\">";
	for(var i=0,len=labels.length;i<len;i++){
		tableHtml += '<tr><td><i style="color:'+color[i]+'" class="icon square"></i>'+labels[i]+'</td></tr>';
	}
	tableHtml += "</table>";
	return tableHtml;
	
}
//<td>'+dataset[i]+'%</td>
// attach ready event
$(document).ready(HMZAdminMgr.load);
