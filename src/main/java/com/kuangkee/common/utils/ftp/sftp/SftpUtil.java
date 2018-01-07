package com.kuangkee.common.utils.ftp.sftp ;
//
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.nio.channels.Channel;
//import java.util.Properties;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.log4j.Logger;
//
//import com.ai.channel.asmt.constants.FtpConstants;
//import com.ai.channel.common.cmpt.ccs.CCSClientFactory;
//import com.ai.paas.ipaas.ccs.IConfigClient;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.Session;
//import com.jcraft.jsch.SftpException;
//
public final class SftpUtil {
//    private static final Logger logger = Logger.getLogger(SftpUtil.class);
//    /**
//     * 连接sftp服务器
//     *
//     * @param host
//     *            主机
//     * @param port
//     *            端口
//     * @param username
//     *            用户名
//     * @param password
//     *            密码
//     * @return
//     */
//    public static final ChannelSftp connect(String host, int port, String username, String password) {
//        ChannelSftp sftp = null;
//        Session session = null;
//        Channel channel = null;
//        try {
//            JSch jsch = new JSch();
//            jsch.getSession(username, host, port);
//            session = jsch.getSession(username, host, port);
//            session.setPassword(password);
//            Properties sshConfig = new Properties();
//            sshConfig.put("StrictHostKeyChecking", "no");
//            session.setConfig(sshConfig);
//            session.setConfig("kex", "diffie-hellman-group1-sha1");
//            session.connect();
//            channel = session.openChannel("sftp");
//            channel.connect();
//            sftp = (ChannelSftp) channel;
//            logger.info("Connected to " + host + " success");
//        } catch (Exception e) {
//            logger.error("Connected to " + host + " failure" + e.toString());
//            if (channel != null && channel.isConnected()) {
//                channel.disconnect();
//            }
//            if (session != null && session.isConnected()) {
//                session.disconnect();
//            }
//        }
//        return sftp;
//    }
//    
//    public static final ChannelSftp getFtpFromConfig() {
//        IConfigClient client=CCSClientFactory.getDefaultConfigClient();
//
//        ChannelSftp sftp = null;
//        Session session = null;
//        Channel channel = null;
//        String username = null;
//        String host = null;
//        int port = 0;
//        String password = null;
//        try {
//            String ftp = client.get(FtpConstants.CSS_FTP_PATH);
//            JSONObject ftpJson = JSON.parseObject(ftp);
//            username = ftpJson.getString(FtpConstants.FTP_USER_NAME);
//            host = ftpJson.getString(FtpConstants.FTP_HOST);
//            port = ftpJson.getIntValue(FtpConstants.FTP_PORT);
//            password = ftpJson.getString(FtpConstants.FTP_PWD);
//            
//            JSch jsch = new JSch();
//            jsch.getSession(username, host, port);
//            session = jsch.getSession(username, host, port);
//            session.setPassword(password);
//            Properties sshConfig = new Properties();
//            sshConfig.put("StrictHostKeyChecking", "no");
//            session.setConfig(sshConfig);
//            session.setConfig("kex", "diffie-hellman-group1-sha1");
//            session.connect();
//            channel = session.openChannel("sftp");
//            channel.connect();
//            sftp = (ChannelSftp) channel;
//            logger.info("Connected to " + host + " success");
//        } catch (Exception e) {
//            logger.error("Connected to " + host + " failure" + e.toString());
//            if (channel != null && channel.isConnected()) {
//                channel.disconnect();
//            }
//            if (session != null && session.isConnected()) {
//                session.disconnect();
//            }
//        }
//        return sftp;
//    }
//    
//    public static final void put( ChannelSftp sftp, InputStream inputStream, String directory, String fileName )throws Exception{
//    	 try {
//             sftp.cd(directory);
//         } catch (SftpException sException) {
//             if (ChannelSftp.SSH_FX_NO_SUCH_FILE == sException.id) {
//                 makeDir(directory, sftp);
//                 sftp.cd(directory);
//             }
//         }
//    	 String dst = directory;
//         try {
//        	 dst = dst + "/" + fileName;
//             sftp.put(inputStream, dst);
//         } catch (Exception e) {
//        	 e.printStackTrace();
//             logger.error("put inputStream to [" + dst + "] failed.Caused by " + e.toString());
//         }
//    }
//    
//
//    /**
//     * 上传文件
//     *
//     * @param directory
//     *            上传的目录
//     * @param uploadFile
//     *            要上传的文件路径
//     * @param sftp
//     * @throws Exception
//     */
//    public static final void upload(String directory, String uploadFile, ChannelSftp sftp) throws Exception {
//        try {
//            sftp.cd(directory);
//        } catch (SftpException sException) {
//            if (ChannelSftp.SSH_FX_NO_SUCH_FILE == sException.id) {
//                makeDir(directory, sftp);
//                sftp.cd(directory);
//            }
//        }
//        try {
//            sftp.put(uploadFile, directory);
//        } catch (Exception e) {
//            logger.error("upload [" + uploadFile + "] to [" + directory + "] failed.Caused by " + e.toString());
//        }
//        //return fileName;
//    }
//
//    private static final void makeDir(String directory, ChannelSftp sftp) throws Exception {
//        String parentPath = new File(directory).getParentFile().getPath().replace("\\", "/");
//        if (parentPath.equals("/")) {
//            sftp.mkdir(directory.substring(1));
//        } else {
//            try {
//                sftp.cd(parentPath);
//            } catch (SftpException sException) {
//                if (ChannelSftp.SSH_FX_NO_SUCH_FILE == sException.id) {
//                    makeDir(parentPath, sftp);
//                }
//            }
//            sftp.mkdir(directory);
//        }
//    }
//
//    public static final void rm(String file, ChannelSftp sftp) throws Exception {
//        if ( (null == file) || file.isEmpty() ){
//            logger.error("输入参数file不能为空");
//            return;
//        }
//
//        try{
//            sftp.rm(file);
//        }catch (SftpException e){
//            if (ChannelSftp.SSH_FX_NO_SUCH_FILE != e.id){
//                String errMsg = String.format("删除文件[%s]失败.原因[%s][id=%d]",file,e.getMessage(),e.id);
//                logger.error(errMsg);
//                throw new Exception(errMsg,e.getCause());
//            }
//        }
//    }
//
//
//    /*
//     * 关闭连接
//     */
//    public static void disconnect(ChannelSftp sftp){
//        if(sftp == null){
//            return;
//        }
//        try {
//            if (sftp.getSession() != null && sftp.getSession().isConnected()) {
//                sftp.getSession().disconnect();
//            }
//            if (sftp.isConnected()) {
//                sftp.disconnect();
//            }
//        } catch (JSchException e) {
//            logger.error("Disconnect sftp error." + e.toString());
//        }
//    }
//
//    /**
//     * 下载文件
//     *
//     * @param directory
//     *            下载目录
//     * @param downloadFile
//     *            下载的文件
//     * @param saveFile
//     *            存在本地的路径
//     * @param sftp
//     */
//
//    public static final void download(String directory, String downloadFile, String saveFile, ChannelSftp sftp) {
//        try {
//            sftp.cd(directory);
//            File file = new File(saveFile);
//            sftp.get(downloadFile, new FileOutputStream(file));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 下载文件到输出流
//     * @param directory
//     * @param fileName
//     * @param response
//     * @param sftp
//     * @throws IOException
//     * @throws SftpException
//     */
//    public static final void download(String file, String fileName, HttpServletResponse response, ChannelSftp sftp) throws IOException, SftpException {
//        OutputStream os = response.getOutputStream();// 取得输出流
//        response.reset();// 清空输出流
//        response.setContentType("multipart/form-data");// 定义输出类型
//        response.setHeader("Content-disposition", "attachment; filename=" + fileName);// 设定输出文件头
//        // 获取文件
//        sftp.get(file, os);
//        os.flush();
//        os.close();
//    }
//    
}


