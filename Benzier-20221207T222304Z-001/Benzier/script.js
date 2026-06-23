const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");

let mousePos = null;
let posRadius = 7;
let pointToMove = null;
let isClickDown = false;
let btnTarefa8 = document.getElementById('btn-tarefa8');
let btnTarefa9 = document.getElementById('btn-tarefa9');
let btnTarefa10 = document.getElementById('btn-tarefa10');

//Definição dos pontos iniciais
let ball = {x:5,y:5,radius:12};
let points = [];

function drawBall() {
    ctx.fillStyle = "black";
    ctx.beginPath();
    ctx.arc(ball.x,ball.y,ball.radius,0,Math.PI * 2,false);
    ctx.fill();
}
//Renderizador dos pontos
function drawPoints() {
    ctx.fillStyle = "blue";
    points.forEach(point => {
        ctx.beginPath();
        ctx.arc(point.x,point.y,posRadius,0,Math.PI * 2,false);
        ctx.fill();
        //Deal with text
        ctx.font = "15px Arial";
        ctx.fillText(`(${point.x},${point.y})`,point.x,point.y+30);
    });
}

//Retorna 'true' para quando o mouse estiver em cima do ponto
function isMouseOverPoint(point) {
    let dx = mousePos.x-point.x;
    let dy = mousePos.y-point.y;
    return(dx*dx+dy*dy<posRadius*posRadius);
}

function checkIfCursorInPoint(){
    if(mousePos && isClickDown && !pointToMove){
        points.forEach(point => {
            if(isMouseOverPoint(point)){
                pointToMove = point;
            }
        })
    }
}

function movePoint() {
    if(pointToMove === points[0]){
        points[0].x = mousePos.x;
        points[0].y = mousePos.y;
        ball.x = mousePos.x;
        ball.y = mousePos.y;
        return
    }
    let pointIndex = points.indexOf(pointToMove);
    points[pointIndex].x = mousePos.x;
    points[pointIndex].y = mousePos.y;
}

function drawLine() {
    ctx.beginPath();
    ctx.setLineDash([8, 15]);
    ctx.moveTo(points[0].x,points[0].y);
    ctx.bezierCurveTo(points[1].x, points[1].y, points[2].x, points[2].y, points[3].x, points[3].y);
    ctx.stroke();
}

function onClickBtnTarefa8(){
    cancelAnimationFrame(onClickBtnTarefa9);
    cancelAnimationFrame(onClickBtnTarefa10);
    requestAnimationFrame(onClickBtnTarefa8);
    console.log('Executando tarefa 8');
    ctx.clearRect(0,0,canvas.width,canvas.height);
    drawBall();
    points=[
        {x:ball.x,y:ball.y},
        {x:45,y:10},
        {x:80,y:80},
        {x:200,y:220} 
    ];
    checkIfCursorInPoint();
    if(pointToMove) 
        movePoint();
    drawLine();
    drawPoints();
}

function onClickBtnTarefa9(){
    cancelAnimationFrame(onClickBtnTarefa8);
    cancelAnimationFrame(onClickBtnTarefa10);
    requestAnimationFrame(onClickBtnTarefa9);
    console.log('Executando tarefa 9');
    points=[
        {x:ball.x,y:ball.y},
        {x:45,y:10},
        {x:80,y:80},
        {x:100,y:120} 
    ];
    ctx.clearRect(0,0,canvas.width,canvas.height);
    drawBall();

    checkIfCursorInPoint();
    if(pointToMove) 
        movePoint();
    drawLine();
    drawPoints();
}

function onClickBtnTarefa10(){
    cancelAnimationFrame(onClickBtnTarefa8);
    cancelAnimationFrame(onClickBtnTarefa9);
    requestAnimationFrame(onClickBtnTarefa10);
    console.log('Executando tarefa 10');
    points=[
        {x:ball.x,y:ball.y},
        {x:45,y:10},
        {x:80,y:80},
        {x:300,y:320} 
    ];
    ctx.clearRect(0,0,canvas.width,canvas.height);
    drawBall();

    checkIfCursorInPoint();
    if(pointToMove) 
        movePoint();
    drawLine();
    drawPoints();
}

//Event listeners

canvas.addEventListener("mousemove", e => {

    mousePos = {
        x: e.clientX - canvas.offsetLeft,
        y: (e.clientY - canvas.offsetTop) + scrollY
    }
});

canvas.addEventListener("mousedown", () => {
    isClickDown = true;
});

canvas.addEventListener("mouseup", () => {
    //Main on click down. Used for simple detection
    isClickDown = false;
    //Not moving that point any more
    pointToMove = null;
});


btnTarefa8.addEventListener('click',onClickBtnTarefa8());
btnTarefa9.addEventListener('click',onClickBtnTarefa9());
btnTarefa10.addEventListener('click',onClickBtnTarefa10());