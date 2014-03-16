<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="index.html" class="navbar-brand">YTUF</a>
        </div>
        <div class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" role="form" method="POST" action="/forumytu/user/signin">
                <div class="form-group">
                    <input class="form-control" name="email" type="email" placeholder="E-mail" required autofocus />
                </div>
                <div class="form-group">
                    <input class="form-control" name="password"  type="password" placeholder="Parola" required />
                </div>
                <button type="submit" class="btn btn-success">Giriş Yap</button>
            </form>
        </div>
    </div>
</div>
<br />