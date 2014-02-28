 <?php
    header('Content-Type: text/html; charset=utf-8');
    //------------------------------------
    $action=isset($_GET["action"])?$_GET["action"]:"";
    $param1= isset($_GET["param1"])?$_GET["param1"]:"";
    $param2=isset($_GET["param2"])?$_GET["param2"]:"";
    //------------------------------------
	$data = array ("action"=>$action, "param1"=>$param1, "param2"=>$param2);
	//print_r($data);
    if(isset($_GET["action"])){

    $ch = curl_init('http://localhost:8080/WebApplication1/server');
    curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
    curl_setopt($ch, CURLOPT_POSTFIELDS, http_build_query($data));
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

    $result = curl_exec($ch);
    $status_code = curl_getinfo($ch, CURLINFO_HTTP_CODE);
        // Check the HTTP Status code
        switch($status_code) {
			case 200: $error_status="";
			break;
			
            case 401:
                    $error_status="401: Login failure.  Try logging out and back in.  Password are ONLY used when posting.";
                    break;
            case 400:
                    $error_status="400: Invalid request.  You may have exceeded your rate limit.";
                    break;
            case 404:
                    $error_status="404: Not found.  This shouldn't happen.  Please let me know what happened using the feedback link above.";
                    break;
			case 405:
					$error_status=$result;
					$result="";
					break;
            case 500:
                    $error_status="500: The servers replied with an error. Hopefully they'll be OK soon!";
                    break;
            case 502:
                    $error_status="502: The servers may be down or being upgraded. Hopefully they'll be OK soon!";
                    break;
            case 503:
                    $error_status="503: The service unavailable. Hopefully they'll be OK soon!";
                    break;
            default:
                    $error_status="Undocumented error: " . $status_code;
                    break;
        }
    echo $error_status;
    //echo $result;
    }
    $actionArray= Array("addition","soustraction","multiplication","division");
    $html="<select name=\"action\">";
    foreach ($actionArray as $value) {
        if($value==$action){
            $html.="<option value=\"".$value."\" selected>".$value."</option>";    
        }else{
            $html.="<option value=\"".$value."\">".$value."</option>";    
        }
    }
    $html.="</select>";
	//print_r($_GET);
    ?>
	<html>
	<style>
	.title{
	margin-left:470px;
	margin-top:20px;
	color:red;
	font-weight:bold;
	font-size:39px;
	}
	.profile{
	margin-left:400px;
	margin-top:130px;
	width:430px;
	height:120px;
	background-color:navy;

	}
	.clear{
	margin-top:10px;
	margin-left:200px;
	}
	.result{
	margin-top:10px;
	margin-left:130px;
	
	}
	</style>
	<div class="title">CALCULATOR</div>
	<div class="profile">
    <form action="" method="GET">
    
       <input type="text" name="param1" value="<?php echo $param1;?>"/>
		<?php echo $html;?>
        <input type="text" name="param2" value="<?php echo $param2;?>"/>
        <div class="clear"><input type="submit" value="="/></div>
		<div class="result"><input type="text" value="<?php echo $result; ?>"></div>
    </form>
	</div>
	</html>