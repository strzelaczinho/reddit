var chars=require("./l33t.json"),
	out=console.log.bind(console);

function main(string){
	var a="",b=string.toLowerCase().split("");
	for(var i=0;i<b.length;i++){
 		if(chars[b[i]]){
			var d=chars[b[i]],v=rand(0,d.length-1);
			a+=d[v];
		}else{
			a+=b[i];
		};
	}
	return a.replace("!","!!!!11!one");
}
function rand(min,max){
	min|=min,max|=max;
 	return Math.floor(Math.random()*(max-min+1)+min);
}
out(main(process.argv.splice(2).join(" ")));