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

    Installation du Curl
    --------------------
    Afin de pouvoir utiliser les fonctions cURL dans PHP, vous devez installer le paquet  libcurl. 
    PHP requiert d'utiliser libcurl 7.0.2-beta ou supérieur.
     En PHP 4.2.3, vous devez utiliser libcurl version 7.9.0 ou supérieur.
     Depuis PHP 4.3.0, vous devez utiliser libcurl version 7.9.8 ou supérieur. 
    PHP 5.0.0 requiert l'utilisation de libcurl version 7.10.5 ou supérieur.
    Pour utiliser CURL depuis les scripts PHP, vous devez compiler celui-ci avec l'option --with-curl[=DIR] 
    où DIR est le chemin jusqu'au dossier contenant les dossiers lib et include. 
    Dans le dossier include, il doit se trouver un dossier appelé curl, qui contient notamment les fichiers easy.h et curl.h. 
    Il doit aussi se trouver un fichier nommélibcurl.a dans le dossier lib.
    À partir de PHP 4.3.0, vous pouvez aussi configurer PHP pour qu'il utilise CURL comme gestionnaire d'URL avec l'option --with-curlwrappers .
    Cette fonctionalité a été déplacée en PECL depuis PHP 5.5.0.

    FONCTION
    --------
    •	curl_close — Ferme une session CURL
    •	curl_copy_handle — Copie une ressource cURL avec toutes ses préférences
    •	curl_errno — Retourne le dernier message d'erreur cURL
    •	curl_error — Retourne une chaîne contenant le dernier message d'erreur cURL
    •	curl_escape — Encode URL la chaîne fournie
    •	curl_exec — Exécute une session cURL
    •	curl_file_create — Crée un objet CURLFile
    •	curl_getinfo — Lit les informations détaillant un transfert cURL
    •	curl_init — Initialise une session cURL
    •	curl_multi_add_handle — Ajoute une ressource cURL à un cURL multiple
    •	curl_multi_close — Termine un jeu de sessions cURL
    •	curl_multi_exec — Exécute les sous-requêtes de la session cURL
    •	curl_multi_getcontent — Retourne le contenu obtenu avec l'option CURLOPT_RETURNTRANSFER
    •	curl_multi_info_read — Lit les informations sur les transferts actuels
    •	curl_multi_init — Retourne un nouveau cURL multiple
    •	curl_multi_remove_handle — Retire une ressource cURL d'un cURL multiple
    •	curl_multi_select — Attend une activité sur n'importe quelle connexion curl_multi
    •	curl_multi_setopt — Définit une option pour le gestionnaire multiple cURL
    •	curl_multi_strerror — Retourne la description d'un code erreur
    •	curl_pause — Met en pause, ou sort de la pause une connexion
    •	curl_reset — Ré-initialise toutes les options d'un gestionnaire de session libcurl
    •	curl_setopt_array — Fixe plusieurs options pour un transfert cURL
    •	curl_setopt — Définit une option de transmission cURL
    •	curl_share_close — Ferme un gestionnaire partagé cURL
    •	curl_share_init — Initialise un gestionnaire partagé cURL
    •	curl_share_setopt — Définit une option du gestionnaire partagé cURL
    •	curl_strerror — Retourne la chaîne descriptive du code erreur fourni
    •	curl_unescape — Décode l'URL fourni
    •	curl_version — Retourne la version courante de cURL
    Au niveau d'un fichier:

    •	CURLFile — La classe CURLFile
    •	CURLFile::__construct — Crée un objet CURLFile
    •	CURLFile::getFilename — Récupère le nom du fichier
    •	CURLFile::getMimeType — Récupère le type MIME
    •	CURLFile::getPostFilename — Récupère le nom de fichier pour POST
    •	CURLFile::setMimeType — Définit le type MIME
    •	CURLFile::setPostFilename — Définit le nom du fichier pour POST
    •	CURLFile::__wakeup — Gestionnaire de délinéarisation





    REMARQUE
    --------
    Attention le port change avec le changement du serveur deployé.
