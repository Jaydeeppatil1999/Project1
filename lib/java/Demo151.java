class Demo151
{
	public void paintComponent(Graphics g)
	{	
		ImageIcon i =new ImageIcon("jay1.jpg");
		Image im=i.getImage();
		g.drawImage(im,333,500,this);		
		setBackground(Color.cyan);
	
	}