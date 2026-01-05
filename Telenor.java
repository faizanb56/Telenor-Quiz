import React from 'react';
import { ExternalLink, Info, Zap, Smartphone, CheckCircle, ShieldCheck, User } from 'lucide-react';

export default function App() {
  
  const handleRedirect = () => {
    // Open the link in a new tab
    window.open('https://telequiztoday.pk/', '_blank');
  };

  return (
    <div className="min-h-screen bg-slate-950 text-slate-200 font-sans flex flex-col items-center relative overflow-hidden selection:bg-cyan-500/30">
      
      {/* Background Effects */}
      <div className="absolute top-0 left-0 w-full h-64 bg-gradient-to-b from-blue-900/20 to-transparent pointer-events-none"></div>
      
      {/* --- HEADER --- */}
      <header className="w-full pt-10 pb-6 text-center z-10 px-4">
        <h1 className="text-3xl md:text-5xl font-black text-transparent bg-clip-text bg-gradient-to-r from-cyan-400 to-blue-500 tracking-tight drop-shadow-lg mb-2">
          TELENOR QUIZ ANSWERS
        </h1>
        <div className="inline-flex items-center gap-2 px-4 py-1.5 rounded-full bg-slate-900 border border-slate-800 shadow-xl">
           <User size={14} className="text-cyan-400" />
           <p className="text-sm font-bold tracking-widest text-slate-400">
             DEVELOPED BY <span className="text-cyan-400">FAIZAN 56</span>
           </p>
        </div>
      </header>

      <main className="w-full max-w-2xl px-6 flex-1 flex flex-col gap-8 z-10 pb-12">

        {/* --- EXPLANATION SECTION --- */}
        <section className="bg-slate-900/80 backdrop-blur border border-slate-800 p-6 rounded-2xl shadow-2xl">
           <h2 className="text-xl font-bold text-white mb-4 flex items-center gap-2">
             <Info className="text-blue-500" /> 
             How It Works & Solution
           </h2>
           <p className="text-slate-400 mb-4 leading-relaxed">
             Telenor "Test Your Skills" quiz is a daily opportunity to win free MBs. To solve the questions correctly every time without wasting your attempts, follow these simple steps:
           </p>
           <ul className="space-y-3">
             <li className="flex items-start gap-3">
               <div className="w-6 h-6 rounded-full bg-blue-500/20 text-blue-400 flex items-center justify-center font-bold text-xs mt-0.5">1</div>
               <p className="text-sm text-slate-300">Open your My Telenor App and go to the Quiz section.</p>
             </li>
             <li className="flex items-start gap-3">
               <div className="w-6 h-6 rounded-full bg-blue-500/20 text-blue-400 flex items-center justify-center font-bold text-xs mt-0.5">2</div>
               <p className="text-sm text-slate-300">Click the blue box below to view today's confirmed answers.</p>
             </li>
             <li className="flex items-start gap-3">
               <div className="w-6 h-6 rounded-full bg-blue-500/20 text-blue-400 flex items-center justify-center font-bold text-xs mt-0.5">3</div>
               <p className="text-sm text-slate-300">Match the answers in the app and claim your free internet.</p>
             </li>
           </ul>
        </section>

        {/* --- MAIN ACTION AREA (THE BOX) --- */}
        <section className="py-4 text-center">
            
            {/* Top Text */}
            <p className="text-yellow-400 font-bold tracking-wider animate-pulse mb-4 flex items-center justify-center gap-2">
                <Zap size={16} fill="currentColor" />
                CLICK HERE FOR QUESTION AND ANSWER
                <Zap size={16} fill="currentColor" />
            </p>

            {/* THE REDIRECT BUTTON/BOX */}
            <div 
              onClick={handleRedirect}
              className="group cursor-pointer relative w-full max-w-sm mx-auto bg-gradient-to-r from-blue-600 to-cyan-600 rounded-3xl p-1 shadow-[0_0_40px_rgba(59,130,246,0.3)] hover:shadow-[0_0_60px_rgba(6,182,212,0.5)] transition-all duration-300 transform hover:-translate-y-1 hover:scale-105"
            >
                <div className="absolute inset-0 bg-white/20 rounded-3xl blur opacity-0 group-hover:opacity-100 transition-opacity"></div>
                
                <div className="bg-slate-900 rounded-[22px] p-8 h-full flex flex-col items-center justify-center border border-white/10 relative z-10 group-hover:bg-slate-900/90">
                    <div className="w-16 h-16 bg-blue-500/10 rounded-full flex items-center justify-center mb-4 group-hover:bg-blue-500/20 transition-colors">
                        <ExternalLink size={32} className="text-cyan-400" />
                    </div>
                    <h2 className="text-3xl font-black text-white mb-1 uppercase text-center leading-none">
                        TELENOR <br/> <span className="text-transparent bg-clip-text bg-gradient-to-r from-cyan-400 to-blue-400">ANSWERS</span>
                    </h2>
                    <p className="text-xs text-slate-500 mt-2 group-hover:text-cyan-400 transition-colors">
                        Tap to Reveal Today's Key
                    </p>
                </div>
            </div>

            {/* Bottom Text */}
            <p className="text-yellow-400 font-bold tracking-wider animate-pulse mt-4 flex items-center justify-center gap-2">
                <Zap size={16} fill="currentColor" />
                CLICK HERE FOR QUESTION AND ANSWER
                <Zap size={16} fill="currentColor" />
            </p>

        </section>

        {/* --- CONCLUSION SECTION --- */}
        <section className="bg-slate-900/50 border border-slate-800 p-6 rounded-2xl">
           <h3 className="text-lg font-bold text-white mb-2 flex items-center gap-2">
             <ShieldCheck className="text-green-500" size={20} />
             Conclusion
           </h3>
           <p className="text-sm text-slate-400 leading-relaxed">
             This platform provides a quick and reliable way to access daily Telenor quiz answers. By using the link provided above, you ensure that you are getting updated information directly from the source. Always remember to check the date before submitting your answers to guarantee your 150MB reward.
           </p>
        </section>

      </main>

      {/* --- FOOTER --- */}
      <footer className="w-full bg-slate-950 border-t border-slate-900 py-6 text-center mt-auto">
        <p className="text-slate-600 text-xs font-mono">
            &copy; 2026 | DEVELOPED BY FAIZAN 56
        </p>
      </footer>

    </div>
  );
}


        
