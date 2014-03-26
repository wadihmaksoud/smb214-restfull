    smb214-restfull
    ===============
    CONTENU DU FICHIER
    ------------------
     * INTRODUCTION
     * CURL
     * INSTALLATION DU CURL
     * FONCTION
     * REMARQUE


    INTRODUCTION
    ------------
    Une simple application intégré dans github pour faciliter le calcule de deux paramètres.
    Le client appèle le serveur pour calculer l'action choisi.
    Une page client index.php qui appèle le serveur afin de calculer une action simple choisi 
    par le client lui même.
    Une page server.java complètant l'action d'un serveur qui utilise le langage java 
    et la combinaison entre les deux pages java et php se fait par l'outil curl.
    Restfull un style d'architecture est particulièrement bien adapté au World Wide Web mais 
    n'en est pas dépendant. Les contraintes, telles que définies par Roy Fielding, 
    peuvent s'appliquer à d'autres protocoles d'application que HTTP en utilisant les méthodes GET et POST.

    CURL
    ----
    Curl est un outil de ligne de commande pour transférer des données avec une syntaxe de l'URL, 
    soutenant DICT, FILE, FTP, FTPS, Gopher, HTTP, HTTPS, IMAP, IMAPS, LDAP, LDAPS, POP3, POP3S, RTMP, RTSP, SCP, SFTP, SMTP,
     SMTPS, Telnet et TFTP. boucle soutient les certificats SSL, HTTP POST, PUT HTTP, le chargement FTP, 
    formulaire HTTP téléchargement base, les procurations, les cookies, l'utilisateur + l'authentification par mot de passe 
    (de base, Digest, NTLM, Negotiate, Kerberos ...), le transfert de fichier CV, tunnel proxy et un busload d'autres trucs 
    utiles.
    L'initialisation du curl se fait sur l'URL suivant: http://localhost:8080/WebApplication1/server

    
    REMARQUE
    --------
    Attention le port change avec le changement du serveur deployé.
