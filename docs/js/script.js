
window.requestAnimFrame = (function(){
    return  window.requestAnimationFrame            || 
            window.webkitRequestAnimationFrame      || 
            window.mozRequestAnimationFrame         || 
            window.oRequestAnimationFrame           || 
            window.msRequestAnimationFrame          || 
            function(callback, element){
                window.setTimeout(function(){
                    callback(+new Date);
                }, 1000 / 60);
            };
})();

var canvas = document.getElementById('canvas')
var ctx = canvas.getContext('2d');
var perceptron = new Perceptron();
var drawer = new Drawer(ctx);
var pos = {x: 0, y: 0}
var dim = {weight: 0, height: 0}
var type = 1;
var points = [];

function gameLoop() {

    window.requestAnimationFrame(gameLoop);

    ctx.canvas.width  = dim.width;
    ctx.canvas.height  = dim.height;

    // // Clear the screen
    ctx.fillStyle = "white";
    ctx.fillRect(0, 0, dim.width, dim.height);

    $.each(points, function(index, point){
        
        if(point.type == 1){
            drawer.drawCircle(point);
        }else{
            drawer.drawRectangle(point);
        }
    })

    var x1 = 0;
    var y1 = perceptron.guessY(x1);

    var x2 = dim.width;
    var y2 = perceptron.guessY(x2);

    drawer.drawLine(x1, y1, x2, y2);
}

function train(){

    perceptron.reset();
    perceptron.setLearningRate(parseFloat($("#learning-rate").val()));
    perceptron.setMaxIterations(parseInt($("#max-iterations").val()))
    perceptron.trainWithIterations(points);
}

$(function(){

    dim = {
        width: $(".container").width(),
        height: $(window).height() - $("#canvas").offset().top - 20
    }
    
    $("#canvas").click(function(event){
        
        var rect = canvas.getBoundingClientRect();

        pos = {
            x: event.clientX - rect.left,
            y: event.clientY - rect.top
        };

        points.push(new Point(pos.x, pos.y, type));
    })

    $("#circle").click(function(event){
        $("#square").removeClass("btn-success")
        $("#square").addClass("btn-outline-success")
        $(this).removeClass("btn-outline-primary")
        $(this).addClass("btn-primary")
       
        type = 1;
    })

    $("#square").click(function(event){
        $("#circle").removeClass("btn-primary")
        $("#circle").addClass("btn-outline-primary")
        $(this).removeClass("btn-outline-success")
        $(this).addClass("btn-success")

        type = 0;
    })

    $("#train").click(train)

    gameLoop();
})