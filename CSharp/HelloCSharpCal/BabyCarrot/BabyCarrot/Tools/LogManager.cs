using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace BabyCarrot.Tools
{
    public class LogManager
    {
        private string _path;

        #region Constructors
        public LogManager(string path)
        {
            this._path = path;
            _SetLogPath();
        }

        public LogManager()
            :this(Path.Combine(Application.Root, "Log"))
        {
        }
        #endregion

        #region Methods
        private void _SetLogPath()
        {
            if (!Directory.Exists(_path))
            {
                Directory.CreateDirectory(_path);
            }
            string logFile = DateTime.Now.ToString("yyyyMMdd") + ".txt";
            _path = Path.Combine(_path, logFile);
        }

        public void Write(string data)
        {
            try
            {
                using (StreamWriter writer = new StreamWriter(_path, true)) // 파일이 없으면 생성을 하고 있으면 파일 뒤에 추가를 해줌
                {
                    writer.WriteLine(data);
                }
            }catch(Exception e)
            {

            }
        }

        public void WriteLine(string data)
        {
            try
            {
                using (StreamWriter writer = new StreamWriter(_path, true)) // 파일이 없으면 생성을 하고 있으면 파일 뒤에 추가를 해줌
                {
                    writer.Write(DateTime.Now.ToString("yyyyMMdd HH:mm:ss\t") + data);
                }
            } catch(Exception e)
            {
            }
        }
        #endregion
    }
}
