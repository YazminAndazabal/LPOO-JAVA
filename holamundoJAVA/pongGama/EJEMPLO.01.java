package pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends JPanel implements ActionListener, KeyListener {
    private int ballX = 160;
    private int ballY = 120;
    private int ballXDirection = 1;
    private int ballYDirection = 1;
    private int paddle1Y = 100;
    private int paddle2Y = 100;
    private int paddle1Direction = 0;
    private int paddle2Direction = 0;

    public PongGame() {
        Timer timer = new Timer(5, this);
        timer.start();
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 300);
        
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, 10, 10);

        g.fillRect(10, paddle1Y, 10, 50);
        g.fillRect(380, paddle2Y, 10, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += ballXDirection;
        ballY += ballYDirection;

        if (ballY <= 0 || ballY >= 290) {
            ballYDirection = -ballYDirection;
        }

        if (ballX <= 20) {
            if (ballY >= paddle1Y && ballY <= paddle1Y + 50) {
                ballXDirection = -ballXDirection;
            } else {
                // Jugador 2 anota un punto
                ballX = 160;
                ballY = 120;
                ballXDirection = -ballXDirection;
            }
        }

        if (ballX >= 370) {
            if (ballY >= paddle2Y && ballY <= paddle2Y + 50) {
                ballXDirection = -ballXDirection;
            } else {
                // Jugador 1 anota un punto
                ballX = 160;
                ballY = 120;
                ballXDirection = -ballXDirection;
            }
        }

        paddle1Y += paddle1Direction;
        paddle2Y += paddle2Direction;

        if (paddle1Y < 0) paddle1Y = 0;
        if (paddle1Y > 250) paddle1Y = 250;
        if (paddle2Y < 0) paddle2Y = 0;
        if (paddle2Y > 250) paddle2Y = 250;

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            paddle1Direction = -1;
        }

        if (key == KeyEvent.VK_S) {
            paddle1Direction = 1;
        }

        if (key == KeyEvent.VK_UP) {
            paddle2Direction = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            paddle2Direction = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_S) {
            paddle1Direction = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            paddle2Direction = 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        PongGame game = new PongGame();
        frame.add(game);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
