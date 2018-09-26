class Drawer{

    constructor(ctx) {
       this.ctx = ctx;
    }

    drawCircle(point) {
    
        this.ctx.beginPath();
        this.ctx.arc(point.x, point.y, 10, 0, 2 * Math.PI, true);
    
        this.ctx.fillStyle = "#434348";
    
        if(perceptron.isReady()){
    
            var output = perceptron.classify(point);
    
            if(output == point.type){
                this.ctx.fillStyle = "#7cb5ec";
            }else{
                this.ctx.fillStyle = "#f45b5b";
            }
        }
    
        this.ctx.fill();
    }
    
    drawRectangle(point) {
        
        this.ctx.beginPath();
        this.ctx.rect(point.x-10, point.y-10, 20, 20);
        
        this.ctx.fillStyle = "#434348";
    
        if(perceptron.isReady()){
            
            var output = perceptron.classify(point);
    
            if(output == point.type){
                this.ctx.fillStyle = "#90ed7d";
            }else{
                this.ctx.fillStyle = "#f45b5b";
            }
        }
    
        ctx.fill();
    }
    
    drawLine(x1, y1, x2, y2){
        this.ctx.beginPath();
        this.ctx.strokeStyle = "#434348";
        this.ctx.moveTo(x1,y1);
        this.ctx.lineTo(x2,y2);
        this.ctx.stroke();
    }
}