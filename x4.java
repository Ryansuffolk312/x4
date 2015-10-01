///// Exercise 4: Ryan Rosario

int r,g,b;
float button1X=250, button1Y=250, button1W=100, button1H=70;
int counter=0;
/////Setup
void setup() {
  size(700, 500);
reset();
}
void reset() {
  r=60;
  g=210;
  b=150;
}

////Button
void draw() {
  background (r,g,b);
  showButton( button1X, button1Y, button1W, button1H);
  fill(0);
  text("Don't Press",  button1X+button1W/2, button1Y+button1H*1/2 );
}
/////Button shape
void showButton(float x, float y, float w, float h) {
  fill(255,0,255);
  ellipse(x,y,w,h);
}
void mousePressed() {
  if ( hit
  
